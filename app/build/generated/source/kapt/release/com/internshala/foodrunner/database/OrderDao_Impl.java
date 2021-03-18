package com.internshala.foodrunner.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrderDao_Impl implements OrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OrderEntity> __insertionAdapterOfOrderEntity;

  private final EntityDeletionOrUpdateAdapter<OrderEntity> __deletionAdapterOfOrderEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrders;

  public OrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderEntity = new EntityInsertionAdapter<OrderEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `orders` (`resId`,`food_items`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderEntity value) {
        if (value.getResId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getResId());
        }
        if (value.getFoodItems() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFoodItems());
        }
      }
    };
    this.__deletionAdapterOfOrderEntity = new EntityDeletionOrUpdateAdapter<OrderEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `orders` WHERE `resId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderEntity value) {
        if (value.getResId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getResId());
        }
      }
    };
    this.__preparedStmtOfDeleteOrders = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM orders WHERE resId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertOrder(final OrderEntity orderEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderEntity.insert(orderEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteOrder(final OrderEntity orderEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfOrderEntity.handle(orderEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteOrders(final String resId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrders.acquire();
    int _argIndex = 1;
    if (resId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, resId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteOrders.release(_stmt);
    }
  }

  @Override
  public List<OrderEntity> getAllOrders() {
    final String _sql = "SELECT * FROM orders";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfResId = CursorUtil.getColumnIndexOrThrow(_cursor, "resId");
      final int _cursorIndexOfFoodItems = CursorUtil.getColumnIndexOrThrow(_cursor, "food_items");
      final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderEntity _item;
        final String _tmpResId;
        _tmpResId = _cursor.getString(_cursorIndexOfResId);
        final String _tmpFoodItems;
        _tmpFoodItems = _cursor.getString(_cursorIndexOfFoodItems);
        _item = new OrderEntity(_tmpResId,_tmpFoodItems);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}

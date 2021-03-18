package com.internshala.foodrunner.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RestaurantDao_Impl implements RestaurantDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RestaurantEntity> __insertionAdapterOfRestaurantEntity;

  private final EntityDeletionOrUpdateAdapter<RestaurantEntity> __deletionAdapterOfRestaurantEntity;

  public RestaurantDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRestaurantEntity = new EntityInsertionAdapter<RestaurantEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `restaurants` (`id`,`name`,`rating`,`cost_for_two`,`image_url`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RestaurantEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getRating() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRating());
        }
        if (value.getCostForTwo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCostForTwo());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageUrl());
        }
      }
    };
    this.__deletionAdapterOfRestaurantEntity = new EntityDeletionOrUpdateAdapter<RestaurantEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `restaurants` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RestaurantEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insertRestaurant(final RestaurantEntity restaurantEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRestaurantEntity.insert(restaurantEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRestaurant(final RestaurantEntity restaurantEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRestaurantEntity.handle(restaurantEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<RestaurantEntity> getAllRestaurants() {
    final String _sql = "SELECT * FROM restaurants";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfCostForTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "cost_for_two");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
      final List<RestaurantEntity> _result = new ArrayList<RestaurantEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RestaurantEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRating;
        _tmpRating = _cursor.getString(_cursorIndexOfRating);
        final String _tmpCostForTwo;
        _tmpCostForTwo = _cursor.getString(_cursorIndexOfCostForTwo);
        final String _tmpImageUrl;
        _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        _item = new RestaurantEntity(_tmpId,_tmpName,_tmpRating,_tmpCostForTwo,_tmpImageUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public RestaurantEntity getRestaurantById(final String resId) {
    final String _sql = "SELECT * FROM restaurants WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (resId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfCostForTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "cost_for_two");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
      final RestaurantEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRating;
        _tmpRating = _cursor.getString(_cursorIndexOfRating);
        final String _tmpCostForTwo;
        _tmpCostForTwo = _cursor.getString(_cursorIndexOfCostForTwo);
        final String _tmpImageUrl;
        _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        _result = new RestaurantEntity(_tmpId,_tmpName,_tmpRating,_tmpCostForTwo,_tmpImageUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}

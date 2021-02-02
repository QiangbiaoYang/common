package com.pixocial.purchases.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * @author jason
 * @date create on 2021/2/1.
 * @describe
 */
public class SPConfig{

    /**
     *
     */
    private SharedPreferences mSharedPreferences;

    /**
     *
     * @param context
     * @param name
     *            配置文件名
     */
    public SPConfig(Context context, String name) {
        mSharedPreferences = context.getSharedPreferences(name,
                Context.MODE_PRIVATE);
    }

    /**
     * 获取long数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public long getLong(String key, long defValue) {
        if (TextUtils.isEmpty(key))
            return defValue;
        try {
            return mSharedPreferences.getLong(key, defValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return defValue;
        }
    }

    /**
     * 存储long数据
     *
     * @param key
     * @param value
     * @return
     */
    public boolean putValue(String key, long value) {
        if (TextUtils.isEmpty(key))
            return false;
        try {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putLong(key, value);
            return editor.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return putValue(key, value);
        }

    }

    /**
     * 获取int数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public int getInt(String key, int defValue) {
        if (TextUtils.isEmpty(key))
            return defValue;
        try {
            return mSharedPreferences.getInt(key, defValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return defValue;
        }
    }

    /**
     * 存储int数据
     *
     * @param key
     * @param value
     * @return
     */
    public boolean putValue(String key, int value) {
        if (TextUtils.isEmpty(key))
            return false;
        try {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putInt(key, value);
            return editor.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return putValue(key, value);
        }

    }

    /**
     * 获取String数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public String getString(String key, String defValue) {
        if (TextUtils.isEmpty(key))
            return defValue;
        try {
            String value = mSharedPreferences.getString(key, defValue);
            return TextUtils.isEmpty(value) ? defValue:value;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return defValue;
        }
    }

    /**
     * 存储String数据
     *
     * @param key
     * @param value
     * @return
     */
    public boolean putValue(String key, String value) {
        if (TextUtils.isEmpty(key))
            return false;
        try {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putString(key, value);
            return editor.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return putValue(key, value);
        }
    }

    /**
     * 获取boolean数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public boolean getBoolean(String key, boolean defValue) {
        if (TextUtils.isEmpty(key))
            return defValue;
        try {
            return mSharedPreferences.getBoolean(key, defValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return defValue;
        }
    }

    /**
     * 存储boolean数据
     *
     * @param key
     * @param value
     * @return
     */
    public boolean putValue(String key, boolean value) {
        if (TextUtils.isEmpty(key))
            return false;
        try {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(key, value);
            return editor.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return putValue(key, value);
        }
    }

    /**
     * 获取boolean数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public float getFloat(String key, float defValue) {
        if (TextUtils.isEmpty(key))
            return defValue;
        try {
            return mSharedPreferences.getFloat(key, defValue);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return defValue;
        }
    }

    /**
     * Float
     *
     * @param key
     * @param value
     * @return
     */
    public boolean putValue(String key, float value) {
        if (TextUtils.isEmpty(key))
            return false;
        try {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putFloat(key, value);
            return editor.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            remove(key);
            return putValue(key, value);
        }
    }


    /**
     * 移除某一项数据
     *
     * @param key
     * @return
     */
    public boolean remove(String key) {
        if (TextUtils.isEmpty(key))
            return false;
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(key);
        return editor.commit();
    }

    public void clear(){
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.clear();
    }

}
package com.zblog.dao;

import com.zblog.dmo.User;

/**
 * 用户Dao
 * 
 * @author  adanac
 * @version  [版本号, 2014-2-12]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface UserDao {
    
    /**
     * 
     * 根据用户对象检索用户信息
     * @param user
     * @return User
     * @see [类、类#方法、类#成员]
     */
    public User getUser(User user);
    
    /**
     * 更新用户信息
     * @param user
     * @return int
     */
    public int updateUser(User user);
}

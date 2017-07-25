package cn.mrdear.resporitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.mrdear.entity.User;

/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:
 */
@Repository
public interface UserResporitory extends JpaRepository<User, Long> {

}

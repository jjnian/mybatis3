package cn.clean.mapper;

import cn.clean.entity.AddressInfo;
import cn.clean.entity.user.LocationUser;
import cn.clean.entity.user.MyDetailUser;
import cn.clean.entity.user.OtherDetailUser;
import cn.clean.entity.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int registerUser(User user);

    MyDetailUser selectByPrimaryKey(Integer id);


    int hasThisUser(String email);

    User selectByEmail(String email);

    int updatePasswordByEmail(@Param("email") String email, @Param("password") String password);

    int updateAvatar(@Param("id") Integer id, @Param("avatar") String avatar);

    User getUserInfo(Integer userid);

    int saveUserInfo(User user);

    Integer signIn(int userId);

    Integer hasSignIn(int userId);

    void reSignIn();

    OtherDetailUser getDetaileUser(@Param("userId")Integer userId, @Param("receiverId")Integer receiverId);

    OtherDetailUser getOtherDetaileUser(Integer userId);

    List<User> getFollowers(Integer userId);

    List<User> getViewers(Integer userId);

    Integer changeAgreeLocation(@Param("userId")Integer userId,@Param("agreeStatus")Integer agreeStatus);

    Integer getAgreeLocation(Integer userId);

    Integer setUserLocation(AddressInfo addressInfo);

    LocationUser getUserMsg(Integer userId);
}

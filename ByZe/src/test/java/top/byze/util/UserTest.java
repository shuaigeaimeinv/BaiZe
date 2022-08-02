package top.byze.util;

import org.junit.Test;
import top.byze.bean.UserFile;
import top.byze.mapper.UserFileSqlProvider;

public class UserTest {

    @Test
    public void userTest() {
        UserFile userFile = new UserFile(100, "test", "/");
//        System.out.println(UserFileSqlProvider.selectUserFile(userFile));
//        System.out.println(UserFileSqlProvider.selectUserFile(userFile.setSelectConditionTypeId(UserFileSqlProvider.Select_By_UID_FileDir_FileState_Y)));
//        System.out.println(UserFileSqlProvider.selectUserFile(userFile.setSelectConditionTypeId(UserFileSqlProvider.Select_By_UID_FileState_N)));

        System.out.println(UserFileSqlProvider.deleteUserFile(userFile.setDeleteConditionTypeId(UserFileSqlProvider.Delete_By_UID_FileState_N)));

    }

}

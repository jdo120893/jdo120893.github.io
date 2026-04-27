package junggo.user.dao;

import junggo.user.dto.UserDTO;

import java.sql.Connection;
import java.sql.SQLException;

public interface UserDAO {
   boolean insertUser(UserDTO userDTO);
   UserDTO login(String email, String pw);

}

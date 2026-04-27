package junggo.user.service;

import junggo.user.dao.UserDAO;
import junggo.user.dao.UserDAOImpl;
import junggo.user.dto.UserDTO;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public boolean insertUser(UserDTO userDTO){

        return userDAO.insertUser(userDTO);
    }



    //로그인 예외처리
    public UserDTO login(String email, String pw){
        UserDTO dto = userDAO.login(email,pw);
        if(dto!=null) {
            System.out.println(dto.getName() + "로그인 성공");
            return dto;
        } else {
            System.out.println("로그인 실패");
            return null;
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thanh
 */
public class StudentDAO {
    public static List <Student> ls = new ArrayList<>();
    public int add(Student st){
        ls.add(st);
        return 1;
    }
    public List<Student> getAllStudent(){
        return ls;
    }
    public int delStudentById(String ma){
        for (Student st : ls){
            if (st.getStudentId().equalsIgnoreCase(ma)){
                ls.remove(st);
                return 1;
            }
        }
        return -1;
    }
    public Student getStudentByID (String id){
        for (Student st: ls){
            if (st.getStudentId().equalsIgnoreCase(id)){
                return st;
            }
        }
        return null;
    }
    public int updateStudentByID(Student stNew){
        for (Student st : ls){
            if(st.getStudentId().equalsIgnoreCase(stNew.getStudentId())){
                st.setAddress(stNew.getAddress());
                st.setSex(stNew.isSex());
                st.setBirthday(stNew.getBirthday());
                st.setName(stNew.getName());
                st.setEmail(stNew.getEmail());
                return 1;
            }
        }
        return -1;
    }
}

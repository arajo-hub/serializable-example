package com.example.serializable.json;

import com.example.serializable.model.Gender;
import com.example.serializable.model.Member;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        /**
         *  ========== 직렬화 ==========
         */

        /**
         * Object 1개 -> Json
         */

//        Member judy = new Member(1, "judy", 25);
//
//        try {
//
//            mapper.writeValue(new File("C:\\Users\\ara\\exserializable\\src\\main\\java\\com\\example\\serializable\\json\\writeone.json"), judy);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * Object 여러 개 -> Json
         */

//        List<Member> memberList = new ArrayList<Member>();
//        memberList.add(new Member(1, "Diana", 35));
//        memberList.add(new Member(2, "Jason", 33));
//        memberList.add(new Member(3, "Poll", 20));
//
//        try {
//
//            mapper.writeValue(new File("C:\\Users\\ara\\exserializable\\src\\main\\java\\com\\example\\serializable\\json\\writelist.json"), memberList);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * Object(Object형 포함) 여러 개 -> Json
         */

//        List<Member> memberList = new ArrayList<Member>();
//        memberList.add(new Member(1, "Diana",  35, Gender.FEMALE));
//        memberList.add(new Member(2, "Jason", 33, Gender.MALE));
//        memberList.add(new Member(3, "Poll", 20, Gender.MALE));
//
//        try {
//
//            mapper.writeValue(new File("C:\\Users\\ara\\exserializable\\src\\main\\java\\com\\example\\serializable\\json\\writelist.json"), memberList);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /**
         *  ========== 역직렬화 ==========
         */

        /**
         * Json 한 개 -> Object
         */

//        try {
//            Member member = mapper.readValue(new File("C:\\Users\\ara\\exserializable\\src\\main\\java\\com\\example\\serializable\\json\\readone.json"), Member.class);
//            System.out.println("member = " + member);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /**
         * Json 여러 개 -> List<Object>
         */

        try {
            ArrayList memberList = mapper.readValue(new File("C:\\Users\\ara\\exserializable\\src\\main\\java\\com\\example\\serializable\\json\\readlist.json"), new ArrayList<Member>().getClass());
            for (Object member : memberList) {
                System.out.println("member = " + member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

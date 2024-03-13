import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.CustService;
import org.example.app.service.ItemService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        //CustDto custDto = new CustDto("id01", "pwd01", "james");
//        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").build();
//        System.out.println(custDto);

        Service<String, CustDto> service;
        service = new CustService();

        //Insert
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        //react에서 받아오는 값을 넣어서
        service.add(custDto);
        //보내준다고 생각

//        List<CustDto> list = null;
//        list = service.get();
//        for(CustDto cust: list) {
//            System.out.println(cust);
//        }


    }
}
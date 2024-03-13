import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.IdNotFoundException;
import com.hana.exception.NotFoundException;
import com.hana.frame.Service;
import com.hana.service.CustService;

public class Main {
    public static void main(String[] args) {
        Service<String, CustDto> service = new CustService();

        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        System.out.println(custDto);
        try {
            service.add(custDto);
        } catch (DuplicatedIdException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 입니다.");
        }

        try {
            service.del("id02");
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 입니다.");
        }

        try {
            service.modify(custDto);
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 입니다.");
        }

        try {
            service.get("id04");
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 입니다.");
        }

        try {
            service.get();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error 입니다.");
        }
    }
}

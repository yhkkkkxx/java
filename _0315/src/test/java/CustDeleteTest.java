import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustDeleteTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id97").name("pwd97").name("james").build();
        try {
            service.remove(obj.getId());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        };
        System.out.println("Hello world!");
    }
}
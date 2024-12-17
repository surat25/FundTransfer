import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundTransferController {

    @GetMapping("/transfer")

    public String getFundTransfer(){

        return "Getting fund transfer Micro service";
    }
}

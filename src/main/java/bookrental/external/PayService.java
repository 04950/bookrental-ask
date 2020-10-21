
package bookrental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="pay", url="http://pay:8080")
public interface PayService {

    @RequestMapping(method= RequestMethod.POST, path="/pays")
    public void pay(@RequestBody Pay pay);

}
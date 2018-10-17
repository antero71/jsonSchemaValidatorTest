package fi.antero.json.springboot;

import fi.antero.json.model.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AddressController {

    private static final String template = "You give address:\n%s\n%s\n%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/address",method = RequestMethod.GET)
    public Address address(@RequestParam(value="street", defaultValue="Street address") String street,
                           @RequestParam(value="postalCode", defaultValue="99999") String postalCode,
                           @RequestParam(value="city", defaultValue="Utsjoki") String city) {
        return new Address(counter.incrementAndGet(),
                street,postalCode,city);
    }
    @RequestMapping(value = "/address",method = RequestMethod.POST)
    public String postAddress(@RequestParam(value="address") String address) {
        return address;
    }
}

package Insurance_Management_System.Address;

import Insurance_Management_System.Account.User;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class AddressManager {
   public static void addAddress(User user, IAddress address) {
        user.getAddress().add(address);
    }

    static void removeAddress(User user, IAddress address) {
        user.getAddress().remove(address);
    }
}

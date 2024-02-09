// The findEmailDomain method extracts the domain name from an email address by searching for the "@" 
// symbol. It starts recording characters after the "@" symbol and appends them to the result string r.
// If the resulting domain still contains another "@" symbol, the method recursively calls itself to further 
// extract the domain from any nested email addresses.


public class EmailDomainFinder {
    public static void main(String[] args) {
        String email = "john.doe@example.com";
        String domain = findEmailDomain(email);
        System.out.println(domain); // Output: example.com
    }

    public static String findEmailDomain(String address) {
        int flag = 0;
        String r = "";

        if (!address.contains("@")) {
            return r;
        }

        for (int i = 0; i < address.length(); i++) {
            if (flag == 1) {
                r = r + address.charAt(i);
            }
            if (address.charAt(i) == '@') {
                flag = 1;
            }
        }

        if (r.contains("@")) {
            r = findEmailDomain(r);
        }

        return r;
    }
}

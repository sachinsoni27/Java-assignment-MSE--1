// Given a list of emails, filter only valid emails (contain "@" and ".").

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterValidEmails {

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user@example.com",
                "invalid-email",
                "another@domain.org",
                "no-at.com",
                "missing.dot@domain",
                "valid@test.net"
        );

        List<String> filtered = emails.stream()
                .filter(FilterValidEmails::isValidEmail)
                .collect(Collectors.toList());

        System.out.println("Original list: " + emails);
        System.out.println("Filtered (valid emails): " + filtered);
    }
}

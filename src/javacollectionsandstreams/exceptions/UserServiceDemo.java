package javacollectionsandstreams.exceptions;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

class UserService {

    void registerUser(String username) throws UserAlreadyExistsException {
        if (username.equals("admin")) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        System.out.println("User registered: " + username);
    }

    void checkUserExistence(String username) throws UserNotFoundException {
        if (!username.equals("admin")) {
            throw new UserNotFoundException("User not found: " + username);
        }
        System.out.println("User exists: " + username);
    }

    public static void main(String[] args) {
        UserService us = new UserService();

        try {
            us.registerUser("admin");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            us.checkUserExistence("guest");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

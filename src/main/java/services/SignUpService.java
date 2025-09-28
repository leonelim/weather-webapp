package services;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SignUpService {
    private static final ConcurrentMap<String, UUID> sessions = new ConcurrentHashMap<>();
    public void signUp() {

    }
}

package com.github.taskfybackend.migration;

import com.github.taskfybackend.model.User;
import com.github.taskfybackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Migration {
    private final UserRepository userRepository;

    public void migration() {
        createCollectionUsers();
    }

    private void createCollectionUsers() {
        var user = User.builder().username("Oleg").email("oleg@gmail.com").password("123456789").build();
        userRepository.save(user);
    }
}

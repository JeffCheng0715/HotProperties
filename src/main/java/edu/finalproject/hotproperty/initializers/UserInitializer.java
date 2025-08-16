package edu.finalproject.hotproperty.initializers;

import edu.finalproject.hotproperty.entities.User;
import edu.finalproject.hotproperty.entities.enums.RoleType;
import edu.finalproject.hotproperty.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

@Component
public class UserInitializer {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  private static final Logger log = LoggerFactory.getLogger(UserInitializer.class);

  @Autowired
  public UserInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
  }

  @PostConstruct
  @Transactional
  public void init() {
    if (userRepository.count() == 0) {
      User admin = new User("Samuel", "Admin", "admin@hotproperties.com", passwordEncoder.encode("demoAdmin"), RoleType.ADMIN);
      User agent1 = new User("Pradnya", "Agent", "agent1@hotproperties.com", passwordEncoder.encode("demoAgent1"),
          RoleType.AGENT);
      User agent2 = new User("Shubham", "Agent", "agent2@hotproperties.com", passwordEncoder.encode("demoAgent2"),
          RoleType.AGENT);
      User buyer = new User("Jeff", "Buyer", "buyer@hotproperties.com", passwordEncoder.encode("demoBuyer"), RoleType.BUYER);

      userRepository.save(admin);
      userRepository.save(agent1);
      userRepository.save(agent2);
      userRepository.save(buyer);

      log.info("Sample users initialized.");
    }
  }
}

package com.guzey.intellistart.interviewplanning.controllers.dto;

import com.guzey.intellistart.interviewplanning.model.user.User;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO for list of Users.
 */
@Getter
@Setter
@NoArgsConstructor
public class UsersDto {
  private List<User> users;
}

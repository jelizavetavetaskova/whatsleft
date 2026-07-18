package dev.vulpden.whatsleft.user;

import dev.vulpden.whatsleft.user.model.User;

public class UserMapper {
    public static AuthorDto toAuthorDto(User user) {
        if (user == null) return null;
        AuthorDto dto = new AuthorDto();
        dto.setUserId(user.getUserId());
        dto.setName(user.getName());
        dto.setSurname(user.getSurname());
        return dto;
    }
}

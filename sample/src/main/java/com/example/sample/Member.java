package com.example.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
// public class Member {
//     private Long id;
//     private String name;
//     private String email;
//     private Integer age;

//     public Member(Long id, String name, String email, Integer age) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//         this.age = age;
//     }

//     public String toString() {
//         return "Member(id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ")";
//     }
// }

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id 
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
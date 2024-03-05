package org.example.back;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/projects")
public class ProjectsController {
    private final JdbcTemplate jdbcTemplate;
    public ProjectsController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping()
    public List<Projects> getAllPosts() {
        String sql = "SELECT * FROM projects";
        List<Projects> Projects = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Projects.class));
        return Projects;
    }
}

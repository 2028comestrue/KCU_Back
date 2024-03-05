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
@RequestMapping("/projectOverview")
public class ProjectOverviewController {
        private final JdbcTemplate jdbcTemplate;
        public ProjectOverviewController(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        @GetMapping()
        public List<ProjectOverview> getAllPosts() {
            String sql = "SELECT * FROM projectOverview";
            List<ProjectOverview> ProjectOverview = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ProjectOverview.class));
            return ProjectOverview;
        }


}

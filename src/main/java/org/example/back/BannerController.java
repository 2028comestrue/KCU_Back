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
@RequestMapping("/banner")
public class BannerController {

    private final JdbcTemplate jdbcTemplate;
    public BannerController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping()
    public List<Banner> getAllPosts() {
        String sql = "SELECT * FROM banner";
        List<Banner> Banner = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Banner.class));
        return Banner;
    }
}

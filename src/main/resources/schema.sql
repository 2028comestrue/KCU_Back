CREATE TABLE IF NOT EXISTS banner
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    image
    VARCHAR
(
    255
) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS projectOverview
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    season
    VARCHAR
(
    255
) NOT NULL,
    image VARCHAR
(
    255
) NOT NULL,
    level VARCHAR
(
    255
) NOT NULL, projectName VARCHAR
(
    255
) NOT NULL,
    people VARCHAR
(
    255
) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS project
(
    id
    INT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    image
    VARCHAR
(
    255
) NOT NULL, projectSummary VARCHAR
(
    255
) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
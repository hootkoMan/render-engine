CREATE TABLE feature (
  id               BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  browser          VARCHAR(255)
                   COLLATE utf8_bin       NOT NULL,
  css_grade        VARCHAR(255)
                   COLLATE utf8_bin       NOT NULL,
  engine_version   VARCHAR(255)
                   COLLATE utf8_bin       NOT NULL,
  platform         VARCHAR(255)
                   COLLATE utf8_bin       NOT NULL,
  rendering_engine VARCHAR(255)
                   COLLATE utf8_bin       NOT NULL
);
package io.github.yyp.jhipster.application.repository.search;

import io.github.yyp.jhipster.application.domain.JobHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the JobHistory entity.
 */
public interface JobHistorySearchRepository extends ElasticsearchRepository<JobHistory, Long> {
}

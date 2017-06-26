package survey;

import org.springframework.data.jpa.repository.JpaRepository;

import survey.Survey;

public interface SurveyRepo extends JpaRepository<Survey, Integer> {

}

package com.guzey.intellistart.interviewplanning.model.interviewerslot;

import com.guzey.intellistart.interviewplanning.model.dayofweek.DayOfWeek;
import com.guzey.intellistart.interviewplanning.model.user.User;
import com.guzey.intellistart.interviewplanning.model.week.Week;
import java.util.List;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;

/**
 * DAO for InterviewerSlot entity.
 */
public interface InterviewerSlotRepository extends CrudRepository<InterviewerSlot, Long> {
  List<InterviewerSlot> getInterviewerSlotsByUserIdAndWeekIdAndDayOfWeek(
      Long userId, Long weekId, DayOfWeek dayOfWeek);

  List<InterviewerSlot> findInterviewerSlotsByUser(User user);

  List<InterviewerSlot> getInterviewerSlotsByUserEmailAndWeekId(String userEmail, Long weekId);

  Set<InterviewerSlot> findByWeek(Week week);

  List<InterviewerSlot> getInterviewerSlotsByUserIdAndWeekId(Long userId, Long weekId);
}

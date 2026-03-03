package com.prathamesh.expense.repository;

import com.prathamesh.expense.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT SUM(e.amount) FROM Expense e " +
            "WHERE YEAR(e.date) = :year AND MONTH(e.date) = :month")
    Double getTotalAmountByMonth(@Param("year") int year,
                                 @Param("month") int month);

}

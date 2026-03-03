package com.prathamesh.expense.repository;

import com.prathamesh.expense.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT SUM(e.amount) FROM Expense e " +
            "WHERE YEAR(e.date) = :year AND MONTH(e.date) = :month")
    Double getTotalAmountByMonth(@Param("year") int year,
                                 @Param("month") int month);


    @Query("SELECT e.category AS category, SUM(e.amount) AS totalAmount " +
            "FROM Expense e " +
            "WHERE YEAR(e.date) = :year AND MONTH(e.date) = :month " +
            "GROUP BY e.category")
    List<CategorySummary> getCategorySummaryByMonth(@Param("year") int year,
                                                    @Param("month") int month);

}

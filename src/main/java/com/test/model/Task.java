package com.test.model;

import com.test.enums.Status;
import com.test.enums.Priority;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "id")
    private Project project;

    @Column
    private Employee manager;

    @Column
    private Priority priority;

    @Column
    private Employee developer;

    @Column
    private Report reports;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "estimation_time")
    private Integer estimationTime;

    @Column(name = "activity_status")
    private Status activityStatus;

    @Column
    private Integer completeness;

    @Column
    private String remark;

}

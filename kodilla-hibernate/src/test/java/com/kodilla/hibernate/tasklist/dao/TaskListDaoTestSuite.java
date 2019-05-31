package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Hey, I'm doing bootcamp task!";

    @Test
    public void testFindByListName() {

        // Given
        TaskList taskList = new TaskList("Study hard", DESCRIPTION);

        // When
        taskListDao.save(taskList);

        // Then
        String testedName = taskList.getListName();
        List<TaskList> readTaskListName = taskListDao.findByListName(testedName);
        Assert.assertEquals(testedName, readTaskListName.get(0).getListName());

        // CleanUp
        taskListDao.deleteAll();
    }
}

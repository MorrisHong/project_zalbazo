package kr.project.zalbazo.mapper;

import kr.project.zalbazo.config.RootConfig;
import lombok.extern.slf4j.Slf4j;
import net.sf.log4jdbc.log.slf4j.Slf4jSpyLogDelegator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@Slf4j
public class TimeMapperTest {

    @Autowired
    private TimeMapper mapper;

    @Test
    public void getTimeTest() {
        log.info(mapper.getTime());
        log.info(Slf4jSpyLogDelegator.class.getName());
    }
}
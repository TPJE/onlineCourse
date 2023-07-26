package ca.bytetube.server.mapper;

import ca.bytetube.server.domain.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    List<Test> list();
}

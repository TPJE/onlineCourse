package ca.bytetube.server.service;

import ca.bytetube.server.domain.Chapter;
import ca.bytetube.server.domain.ChapterExample;
import ca.bytetube.server.dto.ChapterDto;
import ca.bytetube.server.mapper.ChapterMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class ChapterService {
    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list() {
        // Test if page helper works, try to get 1 record in 1 page.
        PageHelper.startPage(1, 1);

        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtoList = new ArrayList<>();
        chapterList.forEach(chapter -> {
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter, chapterDto);
            chapterDtoList.add(chapterDto);
        });
//        chapterExample.createCriteria().andIdEqualTo("1");
        return chapterDtoList;
    }
}

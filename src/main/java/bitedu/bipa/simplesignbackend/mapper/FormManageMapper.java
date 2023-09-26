package bitedu.bipa.simplesignbackend.mapper;

import bitedu.bipa.simplesignbackend.model.dto.*;
import bitedu.bipa.simplesignbackend.model.vo.FormDetailScopeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
public interface FormManageMapper {
    List<CompanyDTO> getFormAndCompList(FormAndCompDTO formAndCompDTO);
    FormDetailResDTO getFormDetail(int code);
    ArrayList<FormDetailScopeVO> getFormDetailScope(int code);

    List<FormListDTO> selectFormListWithSearch(BelongOrganizationDTO belong);

    List<SequenceListDTO> selectSequence(Map map);

    List<SequenceListDTO> selectSequence();

    List<FormItemDTO> getFormItemList();
    void createFormDetail(FormDetailResDTO formDetail);

    void createFormScope(Map map);

    void updateFormDetail(FormDetailResDTO formDetail);

    void updateFormScope(Map map);

    void delFormScope(Map map);

    void insertIgnoreFormScope(Map map);

    void deleteForm(int code);

}

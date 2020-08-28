package rwl.ssm.dao;

import rwl.ssm.bean.CategoryBean;

import java.util.List;

public interface CategoryDao {
    String getNameById(Integer id);
    List<CategoryBean> getAllCategorys();
}

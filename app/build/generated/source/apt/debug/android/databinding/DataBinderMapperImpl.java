package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.rupp.kickstart_mvvm.DataBinderMapperImpl());
  }
}

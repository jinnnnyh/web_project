package bitc.fullstack405.team2.mainThemePop;

import java.util.List;

public interface ThemeService {

  // 시간 선택 시 카페, 테마 아이디로 1줄만 불러옴
  ThemeCafeDTO selectTheme(int cafeId, int themeId) throws Exception ;

  List<ThemeDTO> selectThemeList() throws Exception ;

  List<ThemeCafeDTO> selectThemeCafeList() throws Exception ;

  ThemeDTO selectCafe() throws Exception ;

  List<ThemeCafeDTO> mainItemsList(int idx) throws Exception;

  List<ThemeCafeDTO> selectReviewList() throws Exception;

  List<ThemeCafeDTO> selectAjaxReviewList(int cafeIdx, int themeIdx) throws Exception;
}

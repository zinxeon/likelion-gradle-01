import com.line.domain.Hospital;
import com.line.parser.HospitalParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospitalParserTest {

    // alt + insert => Test Method를 통해 method 생성
    @Test
    // @DisplayName  어노테이션 한글 작성시 깨질 위험 높음
    @DisplayName("test doing well parse id")
    void parseId() { // 이름 변경
        HospitalParser hp = new HospitalParser(); // HospitalParser을 테스트하기 위해
        Hospital hospital = hp.parse("ddd");
        // 기대하는 값, 실제 값 넣음, id에 1번을 넣도록 해놓았기 때문에 기대 값에 1을 넣으면 테스트 통과.
        Assertions.assertEquals("1", hospital.getId());
    }
}
package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;

@Slf4j
class MemberRepositoryVOTest {

    MemberRepositoryV0 repositoryVO = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {

        //save
        Member member = new Member("memberV2", 10000);
        repositoryVO.save(member);

        //findById
        Member findMember = repositoryVO.findById(member.getMemberId());
        assertThat(findMember).isEqualTo(member);
    }

}
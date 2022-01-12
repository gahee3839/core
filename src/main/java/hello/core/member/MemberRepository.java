package hello.core.member;

public interface MemberRepository {

    void save(Member memeber);

    Member findById(Long memberId);
}

package hello.core.member;

public interface MemebrRepository {

    void save(Member member);

    Member findById(Long memberId);
}

/*다시해야됨

package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private  final MemberRepository memberRepository = new MemoryMemberRepository();

    //회원가입
    public Long join(Member member){

        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });

        //중복회원방지1
        /*Optional<Member> result = memberRepository.findByName(member.getName()); // =이후 입력후 cmd+op+v 이용하여 리턴값자동생성
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }); */

        /*중복회원방지2
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                }); 단축키 ctl+t로 만드는데 왜 그럴까... */


        /*전체회원조회
        public List<Member> findMembers() {
            return memberRepository.findAll();
        }

        public Optional<Member> findOne(Long Long memberId;
        memberId) {
            return memberRepository.findById(memberId)
        }

        //제일먼저 생성할수있는
        memberRepository.save(member);
        return member.getId();
    }
}*/

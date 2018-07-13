package search;

public class Movie {
//public class Movie implements Comparable {
	// 저장하고자 하는 학목
	// 영화 제목 ,개봉일,상영시간,감독

	private String title;
	private String release;
	private int runningTime;
	private String director;

	// 접근자 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	// 디버깅을 위한 메소드
	@Override
	public String toString() {
		return "Movie [title=" + title + ", release=" + release + ", runningTime=" + runningTime + ", director="
				+ director + "]";
	}

	// 크기비교를 하는 메소드
	/*@Override
	public int compareTo(Object o) {
		Movie other = (Movie) o;
		//this가 상대방 보다 클 때 양수를 리턴하면 오름 차순

		//return -(this.runningTime -other.runningTime);//내림차순
		//return this.runningTime - other.runningTime;//오름차순
		
		//제목 기준으로 정렬하고 싶을 때 -String은 compareTo가 있음.
		//return this.title.compareTo(other.title);
		return  other.title.compareTo(this.title);
	}*/

}

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 不能使用 CompilePlugin 作为名字，否则会导致加载不了的错误。。
 */
public class TestPlugin implements Plugin<Project> {

  @Override
  void apply(Project project) {

    project.task("doCompile", {
      println "mock compile process"
    })
  }
}
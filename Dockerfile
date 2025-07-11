# ベースイメージはOpenJDK 17でOK（MavenのJavaバージョンに合わせて）
FROM openjdk:17-jdk-alpine

# 作業ディレクトリ作成
WORKDIR /app

# mvnwとpom.xmlを先にコピー（依存キャッシュ用）
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# 依存ダウンロード＆ビルド（mvnwに実行権限をつける）
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# ソースコード全部コピー
COPY src ./src

# 再ビルド（必要なら）
RUN ./mvnw package -DskipTests

# jarファイルの場所指定（実際のjar名はビルドで変わることもあるので注意）
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

# コンテナ起動時にこのjarを実行
ENTRYPOINT ["java", "-jar", "${JAR_FILE}"]

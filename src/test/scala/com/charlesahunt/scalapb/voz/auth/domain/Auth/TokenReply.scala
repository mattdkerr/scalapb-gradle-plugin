// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package voz.auth.domain.Auth



/** Response
  */
@SerialVersionUID(0L)
final case class TokenReply(
    token: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[TokenReply] with com.trueaccord.lenses.Updatable[TokenReply] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (token != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, token) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = token
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): voz.auth.domain.Auth.TokenReply = {
      var __token = this.token
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __token = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      voz.auth.domain.Auth.TokenReply(
          token = __token
      )
    }
    def withToken(__v: String): TokenReply = copy(token = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = token
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(token)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = voz.auth.domain.Auth.TokenReply
}

object TokenReply extends com.trueaccord.scalapb.GeneratedMessageCompanion[voz.auth.domain.Auth.TokenReply] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[voz.auth.domain.Auth.TokenReply] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): voz.auth.domain.Auth.TokenReply = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    voz.auth.domain.Auth.TokenReply(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[voz.auth.domain.Auth.TokenReply] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      voz.auth.domain.Auth.TokenReply(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AuthProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AuthProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = voz.auth.domain.Auth.TokenReply(
  )
  implicit class TokenReplyLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, voz.auth.domain.Auth.TokenReply]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, voz.auth.domain.Auth.TokenReply](_l) {
    def token: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.token)((c_, f_) => c_.copy(token = f_))
  }
  final val TOKEN_FIELD_NUMBER = 1
}